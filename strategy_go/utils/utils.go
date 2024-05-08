package utils

import "os"

// CaptureOutput captures the output of a function and returns it as a string.
func CaptureOutput(f func()) string {
	old := os.Stdout // keep backup of the real stdout
	r, w, _ := os.Pipe()
	os.Stdout = w

	outC := make(chan string)
	go func() {
		var buf []byte
		buf = make([]byte, 1024)
		n, _ := r.Read(buf)
		outC <- string(buf[:n])
	}()

	f()

	err := w.Close()
	if err != nil {
		return ""
	}
	os.Stdout = old // restoring the real stdout
	out := <-outC

	return out
}
