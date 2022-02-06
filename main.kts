from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Nextzz!!!" }
    .to("log:info")
