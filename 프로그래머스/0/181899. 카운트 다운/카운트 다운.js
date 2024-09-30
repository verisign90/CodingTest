function solution(start_num, end_num) {
//     let answer = [];
//     for(let i=start_num; i>=end_num; i--) {
//         answer.push(i);
//     }
    
//     return answer;
    
    return Array.from({length: start_num - end_num + 1}, (_, i) => start_num - i);
    
    // return Array(start_num - end_num + 1)
    //        .fill(start_num)
    //        .map((value, index) => value - index);
}