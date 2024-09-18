function solution(arr) {
//     for(let i=0; i<arr.length; i++) {
//         if(arr[i] >= 50 && arr[i] % 2 === 0) {
//             arr[i] /= 2;
//         } else if(arr[i] < 50 && arr[i] % 2 !==0) {
//             arr[i] *= 2;
//         }
//     }
    
//     return arr;
    
    return arr.map(e => {
        if(e >= 50 && e % 2 === 0) {
            return e / 2;
        } else if(e < 50 && e % 2 !== 0) {
            return e * 2;
        } else {
            return e;
        }
    });
}