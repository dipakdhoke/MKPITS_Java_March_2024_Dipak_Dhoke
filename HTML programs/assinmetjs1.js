// 3. Object Property Aggregation
function sumObjectValues(arr) {
    return arr.reduce((acc, obj) => {
        for (let key in obj) {
            if (obj.hasOwnProperty(key)) {
                acc[key] = (acc[key] || 0) + obj[key];
            }
        }
        return acc;
    }, {});
}

// 4. Frequency Counter
function characterFrequency(str) {
    return str.split('').reduce((acc, char) => {
        acc[char] = (acc[char] || 0) + 1;
        return acc;
    }, {});
}

// 5. Nested Loop for Multiplication Table
function generateMultiplicationTable(n) {
    let table = [];
    for (let i = 1; i <= n; i++) {
        let row = [];
        for (let j = 1; j <= n; j++) {
            row.push(i * j);
        }
        table.push(row);
    }
    return table;
}

// 6. Object Transformation
function convertToObject(arr) {
    return arr.reduce((acc, [key, value]) => {
        acc[key] = value;
        return acc;
    }, {});
}

// 7. String Compression
function compressString(str) {
    let compressed = '';
    let count = 1;
    for (let i = 0; i < str.length; i++) {
        if (str[i] === str[i + 1]) {
            count++;
        } else {
            compressed += str[i] + (count > 1 ? count : '');
            count = 1;
        }
    }
    return compressed;
}

// 8. Array Chunking
function chunkArray(arr, size) {
    let result = [];
    for (let i = 0; i < arr.length; i += size) {
        result.push(arr.slice(i, i + size));
    }
    return result;
}

// 9. Nested Object Access
function getValue(obj, path) {
    return path.split('.').reduce((acc, key) => acc && acc[key], obj);
}

// 10. Array Deduplication
function removeDuplicates(arr) {
    return [...new Set(arr)];
}

// Example usages
console.log(sumObjectValues([{a: 1, b: 2}, {a: 3, b: 4}])); // Output: {a: 4, b: 6}
console.log(characterFrequency("abbccc")); // Output: {a: 1, b: 2, c: 3}
console.log(generateMultiplicationTable(3)); // Output: [[1, 2, 3], [2, 4, 6], [3, 6, 9]]
console.log(convertToObject([['a', 1], ['b', 2], ['c', 3]])); // Output: {a: 1, b: 2, c: 3}
console.log(compressString("aaabbbbcc")); // Output: "a3b4c2"
console.log(chunkArray([1, 2, 3, 4, 5], 2)); // Output: [[1, 2], [3, 4], [5]]
console.log(getValue({a: {b: {c: 42}}}, 'a.b.c')); // Output: 42
console.log(removeDuplicates([1, 2, 2, 3, 4, 4, 5])); // Output: [1, 2, 3, 4, 5]
