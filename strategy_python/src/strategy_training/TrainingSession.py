from dataclasses import dataclass
from datetime import datetime


@dataclass(frozen=True)
class TrainingSession:
    date: datetime.date
    time_slot: str
    place: str
