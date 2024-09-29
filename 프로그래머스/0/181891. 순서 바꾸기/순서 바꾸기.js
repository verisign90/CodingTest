function solution(num_list, n) {
    // let answer = num_list.slice(n);
    // for(let i=0; i<n; i++) {
    //     answer.push(num_list[i]);
    // }
    // return answer;
    
    // let start = num_list.slice(n);
    // let end = num_list.slice(0, n);
    // return start.concat(end);
    
    let start = num_list.slice(n);
    let end = num_list.slice(0, n);
    return [...start, ...end];
    
    // num_list.push(...num_list.splice(0, n));
    // return num_list;
}