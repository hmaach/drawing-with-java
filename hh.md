# Wget Java Project - Code Snippet
By **Yassine El mach** && **Hamza Maach**

```java
private void handleRegularDownloads() {
    String[] urls = this.getUrls();

    if (urls == null || urls.length == 0) {
        parser.printHelp();
        return;
    }

    for (String url : urls) {
        try {
            String fileName = FileManager.determineFileName(parser, url);
            Downloader downloader = new Downloader(
                url, 
                fileName, 
                formatter, 
                rateLimiter
            );
            downloader.download();

        } catch (IOException e) {
            System.err.printf("ERROR: downloading '%s': %s%n", url, e.getMessage());
        }
    }
}

```