// Post-generation script: executed by Maven Archetype Plugin after project creation
// Makes mvnw executable on Unix/macOS systems

def projectDir = new File(request.outputDirectory, request.artifactId)
def mvnw = new File(projectDir, "mvnw")

if (mvnw.exists()) {
    mvnw.setExecutable(true, false)
    println "[archetype] chmod +x mvnw — done"
} else {
    println "[archetype] mvnw not found in generated project, skipping chmod"
}
