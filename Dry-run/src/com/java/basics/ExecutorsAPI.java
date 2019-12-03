package com.java.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsAPI {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable simpleCallable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return String.valueOf(System.currentTimeMillis());
			}
		};
		ExecutorService executor = Executors.newFixedThreadPool(5);
		Future<String> future = executor.submit(simpleCallable);
		System.out.println(future.get());
		List<Callable<String>> callableList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Callable callable = new Callable<String>() {
				@Override
				public String call() throws Exception {
					Thread.sleep(1000);
					return String.valueOf(System.currentTimeMillis());
				}
			};
			callableList.add(callable);
		}

		List<Future<String>> futures = executor.invokeAll(callableList);
		for (Future<String> output : futures) {
			System.out.println(output.get());
		}

		executor.shutdown();
	}
}
