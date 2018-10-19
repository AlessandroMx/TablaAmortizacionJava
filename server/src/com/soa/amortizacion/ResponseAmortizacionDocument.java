/*
 * An XML document type.
 * Localname: responseAmortizacion
 * Namespace: http://soa.com/amortizacion
 * Java type: com.soa.amortizacion.ResponseAmortizacionDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.amortizacion;


/**
 * A document containing one responseAmortizacion(@http://soa.com/amortizacion) element.
 *
 * This is a complex type.
 */
public interface ResponseAmortizacionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseAmortizacionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6050AE16F2E5BA0552BDB48F4CB4EB9A").resolveHandle("responseamortizacion3c23doctype");
    
    /**
     * Gets the "responseAmortizacion" element
     */
    com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion getResponseAmortizacion();
    
    /**
     * Sets the "responseAmortizacion" element
     */
    void setResponseAmortizacion(com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion responseAmortizacion);
    
    /**
     * Appends and returns a new empty "responseAmortizacion" element
     */
    com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion addNewResponseAmortizacion();
    
    /**
     * An XML responseAmortizacion(@http://soa.com/amortizacion).
     *
     * This is a complex type.
     */
    public interface ResponseAmortizacion extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseAmortizacion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6050AE16F2E5BA0552BDB48F4CB4EB9A").resolveHandle("responseamortizaciond456elemtype");
        
        /**
         * Gets the "tabla" element
         */
        com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla getTabla();
        
        /**
         * Sets the "tabla" element
         */
        void setTabla(com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla tabla);
        
        /**
         * Appends and returns a new empty "tabla" element
         */
        com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla addNewTabla();
        
        /**
         * An XML tabla(@http://soa.com/amortizacion).
         *
         * This is a complex type.
         */
        public interface Tabla extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tabla.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6050AE16F2E5BA0552BDB48F4CB4EB9A").resolveHandle("tabla2b0celemtype");
            
            /**
             * Gets array of all "registro" elements
             */
            com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro[] getRegistroArray();
            
            /**
             * Gets ith "registro" element
             */
            com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro getRegistroArray(int i);
            
            /**
             * Returns number of "registro" element
             */
            int sizeOfRegistroArray();
            
            /**
             * Sets array of all "registro" element
             */
            void setRegistroArray(com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro[] registroArray);
            
            /**
             * Sets ith "registro" element
             */
            void setRegistroArray(int i, com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro registro);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "registro" element
             */
            com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro insertNewRegistro(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "registro" element
             */
            com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro addNewRegistro();
            
            /**
             * Removes the ith "registro" element
             */
            void removeRegistro(int i);
            
            /**
             * An XML registro(@http://soa.com/amortizacion).
             *
             * This is a complex type.
             */
            public interface Registro extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Registro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6050AE16F2E5BA0552BDB48F4CB4EB9A").resolveHandle("registro5e1belemtype");
                
                /**
                 * Gets the "periodo" element
                 */
                int getPeriodo();
                
                /**
                 * Gets (as xml) the "periodo" element
                 */
                org.apache.xmlbeans.XmlInt xgetPeriodo();
                
                /**
                 * Sets the "periodo" element
                 */
                void setPeriodo(int periodo);
                
                /**
                 * Sets (as xml) the "periodo" element
                 */
                void xsetPeriodo(org.apache.xmlbeans.XmlInt periodo);
                
                /**
                 * Gets the "saldoInicial" element
                 */
                double getSaldoInicial();
                
                /**
                 * Gets (as xml) the "saldoInicial" element
                 */
                org.apache.xmlbeans.XmlDouble xgetSaldoInicial();
                
                /**
                 * Sets the "saldoInicial" element
                 */
                void setSaldoInicial(double saldoInicial);
                
                /**
                 * Sets (as xml) the "saldoInicial" element
                 */
                void xsetSaldoInicial(org.apache.xmlbeans.XmlDouble saldoInicial);
                
                /**
                 * Gets the "cuotas" element
                 */
                double getCuotas();
                
                /**
                 * Gets (as xml) the "cuotas" element
                 */
                org.apache.xmlbeans.XmlDouble xgetCuotas();
                
                /**
                 * Sets the "cuotas" element
                 */
                void setCuotas(double cuotas);
                
                /**
                 * Sets (as xml) the "cuotas" element
                 */
                void xsetCuotas(org.apache.xmlbeans.XmlDouble cuotas);
                
                /**
                 * Gets the "intereses" element
                 */
                double getIntereses();
                
                /**
                 * Gets (as xml) the "intereses" element
                 */
                org.apache.xmlbeans.XmlDouble xgetIntereses();
                
                /**
                 * Sets the "intereses" element
                 */
                void setIntereses(double intereses);
                
                /**
                 * Sets (as xml) the "intereses" element
                 */
                void xsetIntereses(org.apache.xmlbeans.XmlDouble intereses);
                
                /**
                 * Gets the "abonoCapital" element
                 */
                double getAbonoCapital();
                
                /**
                 * Gets (as xml) the "abonoCapital" element
                 */
                org.apache.xmlbeans.XmlDouble xgetAbonoCapital();
                
                /**
                 * Sets the "abonoCapital" element
                 */
                void setAbonoCapital(double abonoCapital);
                
                /**
                 * Sets (as xml) the "abonoCapital" element
                 */
                void xsetAbonoCapital(org.apache.xmlbeans.XmlDouble abonoCapital);
                
                /**
                 * Gets the "saldoFinal" element
                 */
                double getSaldoFinal();
                
                /**
                 * Gets (as xml) the "saldoFinal" element
                 */
                org.apache.xmlbeans.XmlDouble xgetSaldoFinal();
                
                /**
                 * Sets the "saldoFinal" element
                 */
                void setSaldoFinal(double saldoFinal);
                
                /**
                 * Sets (as xml) the "saldoFinal" element
                 */
                void xsetSaldoFinal(org.apache.xmlbeans.XmlDouble saldoFinal);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro newInstance() {
                      return (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla newInstance() {
                  return (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion newInstance() {
              return (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.amortizacion.ResponseAmortizacionDocument newInstance() {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.amortizacion.ResponseAmortizacionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.amortizacion.ResponseAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
