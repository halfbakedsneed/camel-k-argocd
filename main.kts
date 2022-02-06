from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Eightzz!" }
    .to("log:info")
