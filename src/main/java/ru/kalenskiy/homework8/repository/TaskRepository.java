package ru.kalenskiy.homework8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kalenskiy.homework8.model.Task;
import ru.kalenskiy.homework8.model.impl.TaskStatus;

import java.util.List;

/**
 * Репозиторий задач
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Метод получения списка задач по статусу выполнения
     * @param status статус выполнения задачи
     * @return список задач отфильтрованных по статусу
     */
    List<Task> findAllByTaskStatus(TaskStatus status);

}
