package main;

public interface IAction<T> {
	void exec(T data);
}
