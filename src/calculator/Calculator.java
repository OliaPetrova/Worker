package calculator;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {

	static Supplier<Calculator> instance = Calculator::new;

	BinaryOperator<Integer> plus = (x, y) -> x + y;
	BinaryOperator<Integer> minus = (x, y) -> x - y;
	BinaryOperator<Integer> multiply = (x, y) -> x * y;
	
	/*
	 * В данной операции необходимо добавить проверку на деление на ноль, чтобы
	 * избежать ArithmeticException в BinaryOperator<Integer> devide = (x, y) -> x /y;
	 * Решение: Добавить проверку на деление на ноль внутри операции деления.
	 * Теперь, если y равно 0, операция вернет 0, вместо того чтобы пытаться
	 * выполнить деление.
	 */
	BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x/y : 0;
	
	UnaryOperator<Integer> pow = x -> x * x;
	UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
	
	Predicate<Integer> isPositive = x -> x > 0;
	
	Consumer<Integer> println = System.out::println;
}
