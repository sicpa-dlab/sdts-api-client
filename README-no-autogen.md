# edison-credentials-client

## Regenerate files
Install the openapi-generator:

`brew install openapi-generator`

Execute the following with {OPEN_API_YAML_FILE} replaced by the path of your openapi file.

```
openapi-generator generate \
  -i {OPEN_API_YAML_FILE} \
  -o . \
  --artifact-id edison-credentials-client \
  --package-name com.sicpa.edison.credentialsclient \
  --api-package com.sicpa.edison.credentialsclient.api \
  --model-package com.sicpa.edison.credentialsclient.model \
  --invoker-package com.sicpa.edison.credentialsclient.client \
  --group-id com.sicpa.edison \
  --artifact-version 0.0.1 \
  --additional-properties=dateLibrary=java8 \
  --global-property model,modelTests=false,api,apiTests=false \
  -g java
```

If you want to test locally, execute `mvn clean install` to install in your local repo
and reference this artifact on your project.
