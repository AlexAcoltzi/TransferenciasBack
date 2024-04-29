Ms desarrollados con Spring-boot, por temas de tiempos no se implemento spring security.

Esta conectado a una base de dato PL/SQL, por lo que es necesario ajustar la conexión en el archivo properties, adicional agregar los drivers necesarios para la gestion, en mi caso se usa el driver de Oracle, pero sería necesario agregar en el pom la dependencia necesaria y compilarlo con maven.

Existen mejoras a implementar en algunos casos no hay contro de excepciones, algunas estan por defecto,  en el caso del login si se iomplementaron dos exceociones sencillas, se pueden tomar como referencia, pero, en otros casos por temas de tiempos no se implementaron, se esta contemplando solo el happy path, también se puede distribuir en distintas bases de datos ya que apuntan a la misma, además, se puede encriptar datos sensibles utilizando hash SHA-256.

Ajustar los puertos en el archivo properties en caso de tener los puertos ocupados o desear cambiarlos.

Para pruebas ejecutar este script en el  en el archivo redSinergia.sql en el gestor de base de datos, este esta desarrollado en PL/SQL, hacer los ajustes al gestor de base de datos en caso de ser necesario.

Se puede tomar como base estos MS e intentar implementar las posibles mejoras mencionadas o incluso otras que puedan surgir.
