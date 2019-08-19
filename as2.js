 const digitiz = n => [...`${n}`].map(i => parseInt(i));

console.log(digitiz(123));
console.log(digitiz(1230));