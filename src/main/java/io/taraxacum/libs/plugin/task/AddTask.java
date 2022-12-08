package io.taraxacum.libs.plugin.task;

import javax.annotation.Nonnull;

/**
 * @see TaskTicker
 * @author Final_ROOT
 * @since 2.2
 * @param <T> Target object type
 */
public interface AddTask<T> extends AbstractTask<T> {

    void addTick(@Nonnull T t, @Nonnull AddTask<T> addTask);
}
