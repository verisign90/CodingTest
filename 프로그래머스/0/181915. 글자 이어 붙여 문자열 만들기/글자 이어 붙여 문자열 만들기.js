function solution(my_string, index_list) {
    return index_list.map(e => my_string[e]).join('');
    
    // let answer = "";
    // for(let v of index_list) {
    //     answer += my_string.slice(v, v+1);
    // }
    // return answer;
    
    //return index_list.map(v => [...my_string][v]).join("");
    
    // let answer = "";
    // for(let i=0; i<index_list.length; i++) {
    //     let index = index_list[i];
    //     answer += my_string[index];
    // }
    // return answer;
    
    //return index_list.reduce((acc, e) => acc + my_string[e], "");
}