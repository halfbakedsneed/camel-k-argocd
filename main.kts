from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Changezzz!!!" }
    .to("log:info")
