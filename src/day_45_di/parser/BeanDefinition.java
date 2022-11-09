package day_45_di.parser;

import java.util.ArrayList;
import java.util.List;

public class BeanDefinition {
    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<ConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public boolean isSingleton() {
        return scope.equals(Scope.SINGLETON);
    }


    public static enum Scope {
        SINGLETON,
        PROTOTYPE
    }

    public static class ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg;

        private ConstructorArg(Builder builder) {
            this.isRef = builder.isRef;
            this.type = builder.type;
            this.arg = builder.arg;
        }

        public boolean isRef() {
            return isRef;
        }

        public Class getType() {
            return type;
        }


        public Object getArg() {
            return arg;
        }


        public static class Builder {
            private boolean isRef;
            private Class type;
            private Object arg;

            public Builder setIsRef(boolean isRef) {
                this.isRef = isRef;
                return this;
            }

            public Builder setType(Class type) {
                this.type = type;
                return this;
            }

            public Builder setArg(Object arg) {
                this.arg = arg;
                return this;
            }

            public ConstructorArg build() {
                if (isRef) {
                    if (type != null) {
                        throw new IllegalArgumentException("");
                    }
                    if (arg != null && arg.getClass() != String.class) {
                        throw new IllegalArgumentException("");
                    }
                } else {
                    if (arg == null || type == null) {
                        throw new IllegalArgumentException("");
                    }
                }
                return new ConstructorArg(this);
            }
        }
    }
}
