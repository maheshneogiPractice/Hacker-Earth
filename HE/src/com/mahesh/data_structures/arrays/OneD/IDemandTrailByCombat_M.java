package com.mahesh.data_structures.arrays.OneD;

import java.util.Arrays;
import java.util.Scanner;

public class IDemandTrailByCombat_M {

	private static boolean checkForLanisters(int[] input, int checkForPos) {

		if (checkForPos - 1 >= 0 && input[checkForPos - 1] == 0)
			return false;
		if (checkForPos + 1 < input.length && input[checkForPos + 1] == 0)
			return false;

		return true;
	}

	private static void getSol(int[] input, int n) {
		int[] solArray = new int[input.length];
		for (int i = 0; i < n; i++) {
			int numOfLanistersSitting = 0;
			int numOfLanistersStanding = 0;
			for (int j = 0; j < input.length; j++) {

				if (checkForLanisters(input, j)) {
					numOfLanistersSitting += 1;
					solArray[j] = 1;

					if (numOfLanistersSitting == input.length) {
						printSolArray(solArray);
						return;
					}
				} else {
					numOfLanistersStanding += 1;
					solArray[j] = 0;
					if (numOfLanistersStanding == input.length) {
						printSolArray(solArray);
						return;
					}
				}
			}
			input = Arrays.copyOf(solArray, solArray.length);

		}
		printSolArray(solArray);
	}

	private static void printSolArray(int[] solArray) {
		for (int i = 0; i < solArray.length; i++) {
			System.out.print(solArray[i] + " ");
		}
	}

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int numOfTestCases = s.nextInt();
		for (int i = 0; i < numOfTestCases; i++) {
			int arrayLength = s.nextInt();
			int n = s.nextInt();
			int[] inputArray = new int[arrayLength];

			for (int j = 0; j < arrayLength; j++) {
				inputArray[j] = s.nextInt();

			}
			if (n > 0)
				getSol(inputArray, n);
			else
				printSolArray(inputArray);
			System.out.print("\n");
		}

	}
}
