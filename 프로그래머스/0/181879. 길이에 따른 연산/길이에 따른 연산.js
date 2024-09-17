function solution(num_list) {
    return num_list.length >= 11 
           ? num_list.reduce((sum, cur) => sum + cur, 0)
           : num_list.reduce((mul, cur) => mul * cur, 1);
}