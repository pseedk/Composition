package ru.pvkovalev.composition.domain.usecases

import ru.pvkovalev.composition.domain.entities.GameSettings
import ru.pvkovalev.composition.domain.entities.Level
import ru.pvkovalev.composition.domain.repositories.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}