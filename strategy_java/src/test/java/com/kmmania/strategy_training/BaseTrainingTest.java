package com.kmmania.strategy_training;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class BaseTrainingTest {

    // Utility field and stream for capturing System.out.println output
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    // Setup capturing of System.out.println output
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    // Reset System.out.println output capturing
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    // Utility method to capture System.out.println output
    protected String getStandardOutContent() {
        return outContent.toString().trim();
    }
}
