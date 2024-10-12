function solution(my_strings, parts) {
    // let answer = '';
    // for(let i=0; i<my_strings.length; i++) {
    //     let [s, e] = parts[i];
    //     answer += my_strings[i].slice(s, e+1);
    // }
    // return answer;
    
    // return parts.map(([s, e], i) => {
    //     return my_strings[i].slice(s, e+1);
    // }).join('');
    
    return my_strings.map((str, i) => {
        let [s, e] = parts[i];
        return str.slice(s, e+1);
    }).join('');
}