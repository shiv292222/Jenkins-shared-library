// Define a callable function for Docker operations
def call(String imageName, String imageVersion) {
    // Using Jenkins Pipeline 'sh' step to execute shell command
    sh "docker build -t ${imageName}:${imageVersion} ."
}
