package factory;

public interface EntityFactory<T> {
    T create(String name);
}
