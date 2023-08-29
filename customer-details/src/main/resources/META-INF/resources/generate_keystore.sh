keytool -genkeypair \
        -storepass customer@hdfc \
        -keyalg RSA \
        -validity 365 \
        -storetype PKCS12 \
        -keysize 2048 \
        -dname "CN=server" \
        -alias customer \
        -ext "SAN:c=DNS:localhost,IP:127.0.0.1" \
        -keystore server.p12