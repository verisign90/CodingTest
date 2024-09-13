function solution(my_string) {
    let answer = "";
    
    for(let i=0; i<my_string.length; i++) {
        let char = my_string[i];
        
        if(char === char.toLowerCase()) {
            answer += char.toUpperCase();
        } else {
            answer += char.toLowerCase();
        }
    }
    
    return answer;
    
//     return [...my_string]
//            .map(char => char === char.toLowerCase()
//                 ? char.toUpperCase() 
//                 : char.toLowerCase())                                
//             .join('');
    
//     return my_string.split('')
//            .map(char => char === char.toLowerCase()
//                 ? char.toUpperCase()
//                 : char.toLowerCase())
//            .join('');
}