def call(String goals ='clean install') {
  stage('maven build') {
    sh 'mvn $(goals)'
  }
}
