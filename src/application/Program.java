package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		//cria uma lista ja passando os valores
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		//cria uma stream apartir da lista
		//map(): aplica uma função a cada elemento da stream
		//a função pode ser uma expressão lambda
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		//imprimir a stream na tela	
		//toArray converte a strem para um vetor
		System.out.println(Arrays.toString(st1.toArray()));
		
		//cria uma stream ja acrescentando os elementos
		//Stream.of(): permite colocar os elementos na stream
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		//imprimi a stream na tela
		//toArray converte a strem para um vetor
		System.out.println(Arrays.toString(st2.toArray()));
		
		//Stream.iterate(): função de interação
		//primeiro parametro indica de onde vai começar
		//segundo parametro indica qual a interação
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		//imprimi a stream na tela
		//limit(10): devolve uma nova stream
		//toArray converte a strem para um vetor
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//sequencia de Fibonacci
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
