function comments(arr) {

    let webComments = {};
    let users = [];
    let articles = [];

    while (arr.length > 0) {

        let line = arr.shift();

        if (line.includes('user')) {
            line = line.split(' ');
            line.shift();
            let userName = line.join('');
            users.push(userName);

        } else if (line.includes('article')) {
            line = line.split(' ');
            line.shift();

            let articleName = line.join('');
            articles.push(articleName);

        } else if (line.includes(':')) {
            line = line.split(': ');

            let userAndArticleInfo = line[0].split(' ');
            let userName = userAndArticleInfo.shift();
            let article = userAndArticleInfo.pop();
            let titleAndComment = line[1].split(', ');
            let title = titleAndComment.shift();
            let comment = titleAndComment.pop();

            if (users.includes(userName) && articles.includes(article)) {
                if (!webComments.hasOwnProperty(article)) {
                    webComments[article] = {};
                }
                if (!webComments[article].hasOwnProperty(userName)) {
                    webComments[article][userName] = [];
                }
                webComments[article][userName].push(`${title} - ${comment}`);
            }
        }
    }

    let articlesSortedByCountOfComments = Object.keys(webComments).sort((a, b) =>
        getCountOfComments(webComments[b]) - getCountOfComments(webComments[a]));

    articlesSortedByCountOfComments.map(article => {
        console.log(`Comments on ${article}`);
        let sortedUsers = Object.keys(webComments[article]).sort((a, b) => a.localeCompare(b));

        sortedUsers.map(user => {
            webComments[article][user].map(el => console.log(`--- From user ${user}: ${el}`));
        });
    });

    function getCountOfComments(article) {
        let totalCountOfComments = 0;
        Object.entries(article).map(el => totalCountOfComments += el[1].length);
        return totalCountOfComments;
    }
}