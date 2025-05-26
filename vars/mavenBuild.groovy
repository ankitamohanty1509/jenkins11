def call(String goals ='clean install') {
  stage('Maven Build') {
    sh "mvn ${goals}"
  }
}
