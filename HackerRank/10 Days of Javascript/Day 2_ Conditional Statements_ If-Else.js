

function getGrade(score) {
    let grade;
    if((score <= 30) && (25 < score)) grade = 'A';
    else if((score <= 25) && (20 < score)) grade = 'B';
    else if((score <= 20) && (15 < score)) grade = 'C';
    else if((score <= 15) && (10 < score)) grade = 'D';
    else if((score <= 10) && (5 < score)) grade = 'E';
    else if((score <= 5) && (0 <= score)) grade = 'F';
    
    return grade;
}

