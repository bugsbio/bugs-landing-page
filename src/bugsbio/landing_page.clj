(ns bugsbio.landing-page)

(defn landing-page
  [app]
  (str
    "<html>
      <head>
        <style>
          html, body {
            padding: 0;
            margin: 0;
            background: #efefef;
          }
          .banner {
            text-align: center;
            background: white;
            position: absolute;
            top: calc(50% - 150px);
            border-top: 15px solid #acacac;
            border-bottom: 15px solid #acacac;
            padding: 15px;
            width: 100%;
          }
          .logo {
            height: 100px;
            display: inline-block;
            vertical-align: top;
          }
          .header {
            display: inline-block;
            vertical-align: top;
            font-family: sans-serif;
            font-size: 50px;
            padding: 0;
            margin: 25px;
          }
        </style>
      </head>
      <body>
        <div class=\"banner\">
          <img class=\"logo\" src=\"/img/logo.png\"/>
          <h1 class=\"header\">" app "</h1>
        </div>
      </body>
    </html>"))
