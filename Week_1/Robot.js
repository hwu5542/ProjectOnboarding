const robot = function(...moves) {
    const dir = [[0, 1], [1,0], [0, -1], [-1,0]]
    if (Array.isArray(moves)) {
        let index = 0;
        let x = 0;
        let y = 0;
        let dirIndex = 0;
        while (index < moves.length) {
            x += moves[index] * dir[dirIndex][0];
            y += moves[index] * dir[dirIndex][1];
            dirIndex++;
            if (dirIndex > 3) dirIndex=0;
        }
    }
}