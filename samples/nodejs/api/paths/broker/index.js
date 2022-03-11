module.exports = function () {
    let operations = {
      GET,
      POST,
    };
  
    function POST(req, res, next) {
      console.log(`About to post message: ${JSON.stringify(req.body)}`);
      res.status(201).send();
    }

    function GET(req, res, next) {
      res.status(200).json([
        { id: 0, message: "First todo" },
        { id: 1, message: "Second todo" },
      ]);
    }    

    GET.apiDoc = {
      summary: "Fetch messages.",
      operationId: "getMessages",
      "parameters": [{
        "name": "test",
        "in": "formData",
        "type": "boolean",

    }],
      responses: {
        201: {
          description: "Created",
        },
      },
    };    
  
    POST.apiDoc = {
      summary: "Post a new message.",
      operationId: "createMessage",
      consumes: ["application/xml"],
      parameters: [
        {
          in: "body",
          name: "message",
          schema: {
            $ref: "#/definitions/Message",
          },
        },
      ],
      responses: {
        201: {
          description: "Created",
        },
      },
    };
  
  
    return operations;
  };