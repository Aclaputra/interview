/**
 * cleaner method
 * @param {*} s 
 * @returns 
 */

function timeConversion(s) {
    // Write your code here
    let militaryHour
    militaryHour = s.substring(0,2) ==='12' ? '00' : s.substring(0,2)
    if (s.substring(8, s.length) === 'PM')
        militaryHour = parseInt(militaryHour) + 12 
    console.log(militaryHour + s.substring(2,8));
    return militaryHour + s.substring(2,8)
}

/**
 * normal method
 */
// function timeConversion(s) {
//     // Write your code here
//     let time = "";
//     let h1 = s[0] - '0';
//     let h2 = s[1] - '0';
//     let hh = (h1 * 10 + h2 % 10);
//     if(s[8] == 'A') 
//         if(hh == 12) {
//             time += "00";
//             for(let i=2; i<=7; i++) time += s[i];
//         } else {
//             for(let i = 0; i <= 7; i++) time += s[i];
//         }
//     else 
//         if(hh == 12) {
//             time += "00";
//             for(let i = 2; i <= 7; i++) time += s[i];
//         } else {
//             hh += 12;
//             time += hh.toString();
//             for(let i = 2; i<=7; i++) time += s[i];
//         }
//     console.log(time);
//     return time;
// }
timeConversion('07:05:45PM');

