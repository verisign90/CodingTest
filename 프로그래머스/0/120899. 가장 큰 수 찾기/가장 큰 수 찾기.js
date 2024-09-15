function solution(array) {
//     let answer = [];
//     let max = array[0];
    
//     for(let i=1; i<array.length; i++) {
//         if(max < array[i]) {
//             max = array[i];
//             index = i;
//         } 
//     }
    
//     answer.push(max);
//     answer.push(index);
    
//     return answer;
    
    return [Math.max(...array), array.indexOf(Math.max(...array))];
}