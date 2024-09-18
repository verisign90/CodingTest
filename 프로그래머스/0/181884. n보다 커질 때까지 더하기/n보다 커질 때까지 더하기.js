function solution(numbers, n) {
//     let sum = 0;
    
//     for(let i=0; i<numbers.length; i++) {
//         sum += numbers[i];
//         if(sum > n) {
//             return sum;
//         }
//     }
    
//     let sum = 0;
//     let i = 0;
    
//     while(sum <= n) {
//         sum += numbers[i++];
//     }
    
//     return sum;
    
    // let sum = 0;
    // for(let item of numbers) {
    //     sum += item;
    //     if(sum > n) {
    //         return sum;
    //     }
    // }
    
    // return numbers.reduce((sum, item) => {
    //     if(sum > n) return sum;
    //     return sum += item;
    // }, 0);
    
    return numbers.reduce((sum, cur) => (sum <= n) ? sum + cur : sum, 0);
}