package ru.pvkovalev.composition.domain.usecases

import ru.pvkovalev.composition.domain.entities.Question
import ru.pvkovalev.composition.domain.repositories.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {

        private const val COUNT_OF_OPTIONS = 6
    }
}