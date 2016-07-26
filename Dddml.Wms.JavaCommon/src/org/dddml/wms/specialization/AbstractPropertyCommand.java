package org.dddml.wms.specialization;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Yang on 2016/7/25.
 */
public abstract class AbstractPropertyCommand<TContent, TState> implements PropertyCommand<TContent, TState> {
    private TContent content;

    @Override
    public TContent getContent() {
        return this.content;
    }

    @Override
    public void setContent(TContent content) {
        this.content = content;
    }

    private Supplier<TState> stateGetter;

    @Override
    public Supplier<TState> getStateGetter() {
        return this.stateGetter;
    }

    @Override
    public void setStateGetter(Supplier<TState> stateGetter) {
        this.stateGetter = stateGetter;
    }

    private Consumer<TState> stateSetter;

    @Override
    public Consumer<TState> getStateSetter() {
        return this.stateSetter;
    }

    public void setStateSetter(Consumer<TState> stateSetter) {
        this.stateSetter = stateSetter;
    }

    private String outerCommandType;

    public String getOuterCommandType() {
        return this.outerCommandType;
    }

    public void setOuterCommandType(String type) {
        this.outerCommandType = type;
    }

    public static class SimplePropertyCommand<TContent, TState> extends AbstractPropertyCommand<TContent, TState> {
    }

}
