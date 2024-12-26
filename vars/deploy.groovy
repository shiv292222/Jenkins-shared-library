def call(){
  sh "docker compose down && docker up -d --build"
}
