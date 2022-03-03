from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Next!!!" }
    .to("log:info")
