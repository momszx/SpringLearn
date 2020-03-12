SpringLearn
Path path = Paths.get("src/main/resources/ISCO.csv").toAbsolutePath();
            System.out.println(path.normalize().toString());
