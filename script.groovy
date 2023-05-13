def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing the applicatopn...'
    echo 'doma'
    echo 'koko'
}

def deployApp() {
    echo 'deploying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
