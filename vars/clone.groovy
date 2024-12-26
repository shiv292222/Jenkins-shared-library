def call(String repoUrl, String branch) {
    echo "Cloning repository $repoUrl on branch $branch"
    git url: repoUrl, branch: branch
}
