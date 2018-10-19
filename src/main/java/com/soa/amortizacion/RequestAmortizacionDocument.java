/*
 * An XML document type.
 * Localname: requestAmortizacion
 * Namespace: http://soa.com/amortizacion
 * Java type: com.soa.amortizacion.RequestAmortizacionDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.amortizacion;


/**
 * A document containing one requestAmortizacion(@http://soa.com/amortizacion) element.
 *
 * This is a complex type.
 */
public interface RequestAmortizacionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestAmortizacionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6050AE16F2E5BA0552BDB48F4CB4EB9A").resolveHandle("requestamortizaciondc5fdoctype");
    
    /**
     * Gets the "requestAmortizacion" element
     */
    com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion getRequestAmortizacion();
    
    /**
     * Sets the "requestAmortizacion" element
     */
    void setRequestAmortizacion(com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion requestAmortizacion);
    
    /**
     * Appends and returns a new empty "requestAmortizacion" element
     */
    com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion addNewRequestAmortizacion();
    
    /**
     * An XML requestAmortizacion(@http://soa.com/amortizacion).
     *
     * This is a complex type.
     */
    public interface RequestAmortizacion extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestAmortizacion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6050AE16F2E5BA0552BDB48F4CB4EB9A").resolveHandle("requestamortizacion7b6aelemtype");
        
        /**
         * Gets the "montoTotal" element
         */
        double getMontoTotal();
        
        /**
         * Gets (as xml) the "montoTotal" element
         */
        org.apache.xmlbeans.XmlDouble xgetMontoTotal();
        
        /**
         * Sets the "montoTotal" element
         */
        void setMontoTotal(double montoTotal);
        
        /**
         * Sets (as xml) the "montoTotal" element
         */
        void xsetMontoTotal(org.apache.xmlbeans.XmlDouble montoTotal);
        
        /**
         * Gets the "numeroPagos" element
         */
        int getNumeroPagos();
        
        /**
         * Gets (as xml) the "numeroPagos" element
         */
        org.apache.xmlbeans.XmlInt xgetNumeroPagos();
        
        /**
         * Sets the "numeroPagos" element
         */
        void setNumeroPagos(int numeroPagos);
        
        /**
         * Sets (as xml) the "numeroPagos" element
         */
        void xsetNumeroPagos(org.apache.xmlbeans.XmlInt numeroPagos);
        
        /**
         * Gets the "interesAnual" element
         */
        double getInteresAnual();
        
        /**
         * Gets (as xml) the "interesAnual" element
         */
        org.apache.xmlbeans.XmlDouble xgetInteresAnual();
        
        /**
         * Sets the "interesAnual" element
         */
        void setInteresAnual(double interesAnual);
        
        /**
         * Sets (as xml) the "interesAnual" element
         */
        void xsetInteresAnual(org.apache.xmlbeans.XmlDouble interesAnual);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion newInstance() {
              return (com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.soa.amortizacion.RequestAmortizacionDocument newInstance() {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.soa.amortizacion.RequestAmortizacionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.soa.amortizacion.RequestAmortizacionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
