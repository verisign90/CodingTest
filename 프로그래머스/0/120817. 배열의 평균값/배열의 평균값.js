function solution(numbers) {
    return numbers.reduce((sum, curr) => sum + curr, 0) / numbers.length;
}