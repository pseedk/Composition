package ru.pvkovalev.composition.domain.repositories

import ru.pvkovalev.composition.domain.entities.GameSettings
import ru.pvkovalev.composition.domain.entities.Level
import ru.pvkovalev.composition.domain.entities.Question

interface GameRepository {

    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question

    fun getGameSettings(level: Level): GameSettings
}