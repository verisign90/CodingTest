function solution(my_string, is_prefix) {
    return my_string.startsWith(is_prefix) ? 1 : 0;
    // return +my_string.startsWith(is_prefix);
    // return +(my_string.indexOf(is_prefix) === 0);
    // return my_string.slice(0, is_prefix.length) === is_prefix ? 1 : 0;
    // return new RegExp(`^${is_prefix}`).test(my_string) ? 1 : 0;
    // return (my_string.split(is_prefix))[0] === "" ? 1 : 0;
    //return my_string.slice(0, is_prefix.length).includes(is_prefix) ? 1 : 0;
}