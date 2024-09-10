function solution(my_string) {
    let sum = 0;
    
    for(let i=0; i<my_string.length; i++) {
        if(!isNaN(my_string[i])) {
            sum += parseInt(my_string[i]);
        }
    }
    
    return sum;
    
//     return Array.from(my_string)
//            .filter(char => !isNaN(parseInt(char)))   
//            .reduce((sum, curr) => sum + parseInt(curr), 0);
    
//     return [...my_string].reduce((sum, cur) => Number(cur) ? sum + +cur : sum, 0);
    
//     return my_string.replaceAll(/[^0-9]/g, '').split('')
//                     .reduce((sum, cur) => sum + +cur, 0);
}