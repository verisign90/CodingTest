function solution(my_string, is_suffix) {
    return my_string.endsWith(is_suffix) ? 1 : 0;
    //return +my_string.endsWith(is_suffix);
    //return my_string.slice(my_string.length - is_suffix.length) === is_suffix ? 1 : 0;
    //return my_string.substr(-is_suffix.length) === is_suffix ? 1 : 0;
//     return +Boolean([my_string].find(
//         (e) => my_string.slice(my_string.length - is_suffix.length) === is_suffix));
}