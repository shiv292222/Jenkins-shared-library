def call() {
    // Use Jenkins pipeline step 'sh' to execute shell commands
    sh "docker compose down && docker compose up -d --build"
}
